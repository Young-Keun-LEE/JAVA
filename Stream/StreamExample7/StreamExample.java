package Stream.StreamExample7;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.stream.*;
public class StreamExample {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(line -> System.out.println(line));
        stream.close();
    }
}
