package io.mykit.fastdfs.constants;

/**
 * @author binghe
 * @version 1.0.0
 * @description 常量
 */
public class ResourcesConstants {
	
	private static final String BASE_RESOURCES_URL = "http://192.168.175.100/";
	
	public static String getResourcesUrl(String fileId) {
		return BASE_RESOURCES_URL.concat(fileId);
	}
}
