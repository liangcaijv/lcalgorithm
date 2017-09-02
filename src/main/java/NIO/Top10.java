package NIO;
import java.io .File;
import java.io .IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class Top10 implements Runnable {
    String path;
    Top10(String path){
        this.path = path;
    }
    public void run() {
        
           synchronized(this) {
               //创建读取、写入通道
               try(FileChannel channel = FileChannel.open(Paths.get(path), StandardOpenOption.READ,StandardOpenOption.WRITE);){
               File file = new File(path);
               while(file.length()<=1024*1024) {    //生成1G的txt文件
                   String str = "abcdefghijklmnopqrstuvwxyz";
                   StringBuffer sb = new StringBuffer();//为了拼接字符串 
                   for (int i = 0; i <= 6; ++i) { 
                       sb.append(str.charAt(new Random().nextInt(26)));        //拼接26个字母
                   }
                   sb.append(" ");          //拼接完的字符用" "分开
                   String str1 = sb.toString();
                   channel.write(ByteBuffer.wrap(str1.getBytes()));
               }
               }catch(IOException e) {
                   e.printStackTrace();
               }
           } 
        
    }

}
//    channel.position(channel.size());
