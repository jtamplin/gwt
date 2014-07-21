/*
 * Copyright 2014 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.core.ext.linker.impl;

/**
 * A starting and ending byte range with associated name.
 */
public class NamedRange {

  private int endPosition;
  private final String name;
  private int startPosition;

  public NamedRange(String name) {
    this.name = name;
  }

  public int getEndPosition() {
    return endPosition;
  }

  public String getName() {
    return name;
  }

  public int getStartPosition() {
    return startPosition;
  }

  public void setEndPosition(int endPosition) {
    this.endPosition = endPosition;
  }

  public void setStartPosition(int startPosition) {
    this.startPosition = startPosition;
  }
}