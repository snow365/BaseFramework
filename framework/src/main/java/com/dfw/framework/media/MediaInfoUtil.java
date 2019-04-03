package com.dfw.framework.media;

import java.io.File;

import com.abercap.mediainfo.api.MediaInfo;

public class MediaInfoUtil {
	@SuppressWarnings("resource")
	public void getMediaInfo()
	{
		MediaInfo mediaInfo = new MediaInfo();
		mediaInfo.open(new File("F:\\BaiduYunDownload\\深海越狱.Black.Water.20182018.中文字幕.BDrip.AAC.720P.x264-Lee.mp4"));
		String type = mediaInfo.get(MediaInfo.StreamKind.General, 0, "FileExtension", MediaInfo.InfoKind.Text);
        String width = mediaInfo.get(MediaInfo.StreamKind.Video, 0, "Width", MediaInfo.InfoKind.Text);
        String height = mediaInfo.get(MediaInfo.StreamKind.Video, 0, "Height", MediaInfo.InfoKind.Text);
        //System.out.println( mediaInfo.get(MediaInfo.StreamKind.Video, 0, "", MediaInfo.InfoKind.Text));
        
        System.out.println(type);
        System.out.println(width);
        System.out.println(height);
	}
	public static void main(String[] args) {
		MediaInfoUtil mu = new MediaInfoUtil();
		mu.getMediaInfo();
	}
}
