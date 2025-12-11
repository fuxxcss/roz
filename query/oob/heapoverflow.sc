@main def HeapOverflow(target: String) = {

    importCode(inputPath=target, projectName=target)
    val src =
          cpg.method(".*malloc$").callIn.where(_.argument(1).arithmetic)

    var p =  cpg.method("(?i)memcpy").callIn.filter { memcpyCall =>
          memcpyCall
            .argument(1)
            .reachableBy(src)
            .where(_.inAssignment.target.codeExact(memcpyCall.argument(1).code))
            .whereNot(_.argument(1).codeExact(memcpyCall.argument(3).code))
            .hasNext
        }.p
    LogList(target, p)
}