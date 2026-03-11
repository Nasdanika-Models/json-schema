package org.nasdanika.models.json.schema.util;

import org.nasdanika.models.json.schema.JsonSchemaPackage;

/**
 * Registers {@link JsonSchemaPackage} with an EMF ResourceSet.
 * Integrate with org.nasdanika.capability.emf.EPackageCapabilityFactory when
 * the nasdanika-core capability module is available on the class path.
 */
public class JsonSchemaEPackageResourceSetCapabilityFactory {

public static void register() {
// Trigger package registration
JsonSchemaPackage.eINSTANCE.getClass();
}

}
