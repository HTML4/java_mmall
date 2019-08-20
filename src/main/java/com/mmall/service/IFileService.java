package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jason on 2019/8/13.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
