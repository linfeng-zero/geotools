/**
 *
 * $Id$
 */
package net.opengis.wfs20.validation;

import java.math.BigInteger;

import java.util.Calendar;

import net.opengis.wfs20.AdditionalObjectsType;
import net.opengis.wfs20.TruncatedResponseType;

/**
 * A sample validator interface for {@link net.opengis.wfs20.FeatureCollectionType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FeatureCollectionTypeValidator {
  boolean validate();

  boolean validateAdditionalObjects(AdditionalObjectsType value);
  boolean validateTruncatedResponse(TruncatedResponseType value);
  boolean validateLockId(String value);
  boolean validateNext(String value);
  boolean validateNumberMatched(Object value);
  boolean validateNumberReturned(BigInteger value);
  boolean validatePrevious(String value);
  boolean validateTimeStamp(Calendar value);
}
