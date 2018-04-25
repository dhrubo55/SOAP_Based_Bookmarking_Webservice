package com.dhrubo;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

//import com.bookmarks_Details.getBookmarksDetailsRequest.java;
//import com.bookmarks_Details.getBookmarksDetailsResponse;
//import com.bookmarks_Details.bookmarksDetails;

import com.dhrubo.getBookmarksDetailsRequest;
import com.dhrubo.getBookmarksDetailsResponse;
import com.dhrubo.bookmarksDetails;

@Endpoint
public class bookmarksDetailEndpoint {
// change namsepace and class names
  @PayloadRoot(namespace = "http://localhost:8080/bookmarks", localPart = "getBookmarksDetailsRequest")
  @ResponsePayload
  public getBookmarksDetailsResponse processCourseDetailsRequest(@RequestPayload getBookmarksDetailsRequest request) {
    getBookmarksDetailsResponse response = new getBookmarksDetailsResponse();
    
    bookmarksDetails bDetails = new bookmarksDetails();
    bDetails.setId(request.getId());
    bDetails.setName("Adam");
    bDetails.setUrl("E1234567");
    bDetails.setTag("Software");
    
    response.setBookmarksDetails(bDetails);
    
    return response;
  }

}