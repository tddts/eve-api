package com.github.tddts.eve.model;

/**
 * @author Tigran Dadaiants
 */
public interface EveDataSource {

  String TRANQUILITY = "tranquility";
  String SINGULARITY = "singularity";

  static String defaultSource() {
    return TRANQUILITY;
  }
}
