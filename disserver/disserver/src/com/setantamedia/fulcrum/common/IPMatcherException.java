/**
 * The contents of this file are subject to the license and copyright detailed in the LICENSE and NOTICE files at the
 * root of the source tree and available online at
 *
 * http://www.dspace.org/license/
 */
package com.setantamedia.fulcrum.common;

/**
 * Thrown when there is a problem parsing an IP matcher specification.
 *
 * @version $Revision: 5844 $
 * @author Robert Tansley
 */
public class IPMatcherException extends Exception {

   public IPMatcherException() {
      super();
   }

   public IPMatcherException(String message) {
      super(message);
   }

   public IPMatcherException(Throwable cause) {
      super(cause);
   }

   public IPMatcherException(String message, Throwable cause) {
      super(message, cause);
   }
}
