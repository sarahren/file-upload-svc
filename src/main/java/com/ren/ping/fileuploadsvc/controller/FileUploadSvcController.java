package com.ren.ping.fileuploadsvc.controller;

import com.ren.ping.fileuploadsvc.entity.File;
import com.ren.ping.fileuploadsvc.repository.FileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class FileUploadSvcController {

    @Autowired
    private FileRepository fileRepository;

    @PostMapping(path = "/files", consumes = "application/json;charset=UTF-8", produces = {"application/json; charset=UTF-8"})
    @ResponseBody
    public File uploadFile(@RequestBody File file) {
        log.info("upload file is started... {}", file);
        fileRepository.save(file);
        log.info("upload file is done.");
        return file;
    }

    @GetMapping(path = "/files", produces = {"application/json; charset=UTF-8"})
    public List<File> getFiles() {
        log.info("get files is started...");
        return (List<File>) fileRepository.findAll();
    }


}
