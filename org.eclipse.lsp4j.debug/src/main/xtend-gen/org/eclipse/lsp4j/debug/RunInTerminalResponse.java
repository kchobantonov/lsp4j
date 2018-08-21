/**
 * Copyright (c) 2017, 2018 Kichwa Coders Ltd. and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Response to 'runInTerminal' request.
 */
@SuppressWarnings("all")
public class RunInTerminalResponse {
  /**
   * The process ID.
   * <p>
   * This is an optional property.
   */
  private Long processId;
  
  /**
   * The process ID.
   * <p>
   * This is an optional property.
   */
  @Pure
  public Long getProcessId() {
    return this.processId;
  }
  
  /**
   * The process ID.
   * <p>
   * This is an optional property.
   */
  public void setProcessId(final Long processId) {
    this.processId = processId;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("processId", this.processId);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    RunInTerminalResponse other = (RunInTerminalResponse) obj;
    if (this.processId == null) {
      if (other.processId != null)
        return false;
    } else if (!this.processId.equals(other.processId))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.processId== null) ? 0 : this.processId.hashCode());
  }
}
