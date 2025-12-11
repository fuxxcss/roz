@main def StackOverflow(target: String) = {
    
    importCode(inputPath=target, projectName=target)

    var p = cpg.local.code(".*[256].*").p
/*
    var param = cpg.method(source).parameter
    var arg = cpg.call.name(sink).argument
    var p = arg.reachableByFlows(param).p
*/
    LogList(target, p)
}
