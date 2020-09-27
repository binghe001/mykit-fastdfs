package io.mykit.fastdfs;

import io.mykit.fastdfs.utils.FastDFSClientUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author binghe
 * @version 1.0.0
 * @description 启动
 */
@SpringBootApplication
public class ResourceStarter {
	
	public static void main(String[] args) {
		try {
			String filePath = "fastdfs_client.conf";
			if(args.length > 0) {
				filePath = args[0];
			}
			FastDFSClientUtils.setFile(filePath);
			SpringApplication.run(ResourceStarter.class, args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
