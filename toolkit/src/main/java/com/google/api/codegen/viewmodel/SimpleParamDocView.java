/* Copyright 2016 Google Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.api.codegen.viewmodel;

import com.google.auto.value.AutoValue;
import java.util.List;

@AutoValue
public abstract class SimpleParamDocView implements ParamDocView {
  public abstract String paramName();

  public abstract String typeName();

  public abstract List<String> lines();

  public String firstLine() {
    return lines().get(0);
  }

  public List<String> remainingLines() {
    return lines().subList(1, lines().size());
  }

  public String type() {
    return SimpleParamDocView.class.getSimpleName();
  }

  public static Builder newBuilder() {
    return new AutoValue_SimpleParamDocView.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder paramName(String val);

    public abstract Builder typeName(String val);

    public abstract Builder lines(List<String> val);

    public abstract SimpleParamDocView build();
  }
}
