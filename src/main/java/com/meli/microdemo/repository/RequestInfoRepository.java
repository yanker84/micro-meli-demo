package com.meli.microdemo.repository;

import com.meli.microdemo.model.RequestInfo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestInfoRepository extends JpaRepository<RequestInfo,Long> {
}
