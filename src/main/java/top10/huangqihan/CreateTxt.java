/*package top10.huangqihan;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Random;

public class CreateTxt {

	public static void main(String[] args) {
		Write tt1 = new Write("D:/niotest/test1.txt");
		Write tt2 = new Write("D:/niotest/test2.txt");
		Write tt3 = new Write("D:/niotest/test3.txt");
		Write tt4 = new Write("D:/niotest/test4.txt");
		Write tt5 = new Write("D:/niotest/test5.txt");
		Write tt6 = new Write("D:/niotest/test6.txt");
		Write tt7 = new Write("D:/niotest/test7.txt");
		Write tt8 = new Write("D:/niotest/test8.txt");
		Write tt9 = new Write("D:/niotest/test9.txt");
		Write tt10 = new Write("D:/niotest/test10.txt");
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		Thread t3 = new Thread(tt3);
		Thread t4 = new Thread(tt4);
		Thread t5 = new Thread(tt5);
		Thread t6 = new Thread(tt6);
		Thread t7 = new Thread(tt7);
		Thread t8 = new Thread(tt8);
		Thread t9 = new Thread(tt9);
		Thread t10 = new Thread(tt10);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
	}

}
class Write implements Runnable{

	String road;
	Write(String road){
		this.road = road;
	}
	@Override
	public void run() {
		// 创建读取文件通道
			try(FileChannel channel = FileChannel.open(Paths.get(road), StandardOpenOption.READ,StandardOpenOption.WRITE);){
					//读取到buffer
				File f = new File(road);
				while(f.length()<1024*1024) {
				
					String str = "abcdefghijklmnopqrstuvwxyz";//含有字符和数字的字符串
			        Random random = new Random();//随机类初始化
			        StringBuffer array = new StringBuffer();//StringBuffer类生成，为了拼接字符串
			        int len = random.nextInt(15);
			        for (int i = 0; i < len; ++i) {
			            int number = random.nextInt(26);// [0,26)
			            array.append(str.charAt(number));
			        }
			        array.append(" ");
					channel.position(channel.size());
					String arrayl = array.toString();
					channel.write(ByteBuffer.wrap(arrayl.getBytes()));
				}
				}catch(IOException e) {
					e.printStackTrace();
				}
		
	}
	
}*/