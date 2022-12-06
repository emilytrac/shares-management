package com.example.sharesManagement.resource;

import com.example.sharesManagement.entity.Shares;
import com.example.sharesManagement.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SharesResource {

    @Autowired
    ShareService shareService;

    @RequestMapping(path = "/shares", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Shares> getAllSharesResource() {
        return shareService.getAllShares();
    }

    @RequestMapping(path = "/shares/{sharesNum}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Shares searchShareByShareId(@PathVariable("sharesNum") int shareId) {
        return shareService.searchShareByShareId(shareId);
    }

}
