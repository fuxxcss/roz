import java.nio.file.Files;
import java.nio.file.Paths

def LogList(path: String, list: List[String]) = {

    val content = list.mkString("\n").getBytes
    Files.write(Paths.get(path + ".log"), content)
}


