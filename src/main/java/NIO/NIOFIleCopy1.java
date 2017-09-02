package NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFIleCopy1 {

    public static void main(String[] args) {
        //创建Channel对象
        try (FileChannel rchannel = FileChannel.open(Paths.get("d:/test1.txt"), StandardOpenOption.READ);
                FileChannel wchannel = FileChannel.open(Paths.get("d:/test2.txt"), StandardOpenOption.WRITE,StandardOpenOption.CREATE) ) {
            //读取Channel内容
            ByteBuffer  buffer = ByteBuffer.allocate(131072);
            int flag = rchannel.read(buffer);
            while(flag != -1) {
                //处理buffer
                buffer.flip();  //切换写到读模式。 limit=position then position=0
                int result = wchannel.write(buffer);
                System.out.println(result);
                buffer.clear();
                flag = rchannel.read(buffer);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
