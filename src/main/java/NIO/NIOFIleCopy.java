package NIO;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 * 面向通道的channel
 * @author 梁偲
 *
 */
/*public class NIOFIleCopy {

    public static void main(String[] args) {
        //创建Channel对象
        try (FileChannel channel = FileChannel.open(Paths.get("d:/test.txt"), StandardOpenOption.READ);) {
            //读取Channel内容
            ByteBuffer  buffer = ByteBuffer.allocate(1024);
            int flag = channel.write(buffer);
            while(flag != -1) {
                //处理buffer
                buffer.flip();  //切换写到读模式。 limit=position then position=0
                Charset charset = Charset.forName("GBK");   //声明编码格式
                CharBuffer charBuffer = charset.decode(buffer); //把ByteBuffer编码成字符
                while(charBuffer.hasRemaining()) {
                    System.out.print(charBuffer.get());
                }
                buffer.clear();
                flag = channel.read(buffer);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}*/
