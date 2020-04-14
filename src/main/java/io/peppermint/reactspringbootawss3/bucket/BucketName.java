package io.peppermint.reactspringbootawss3.bucket;

import org.springframework.beans.factory.annotation.Value;

public enum BucketName {
    PROFILE_IMAGE("springboot-s3"); //aws bucket name

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
