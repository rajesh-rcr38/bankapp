package com.locus.bank;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class BranchNotFoundException extends RuntimeException{

private String ifsc;

public BranchNotFoundException(String ifsc) {
super(String.format(" not found : '%s'",ifsc));
this.ifsc=ifsc;

}

public String getId() {
return this.ifsc;
}

}