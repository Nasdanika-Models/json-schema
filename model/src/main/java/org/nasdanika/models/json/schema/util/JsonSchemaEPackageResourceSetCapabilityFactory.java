package org.nasdanika.models.json.schema.util;

import org.nasdanika.models.json.schema.JsonSchemaPackage;

/**
 * Registers {@link JsonSchemaPackage} with the EMF global EPackage registry.
 * Integrate with {@code org.nasdanika.capability.emf.EPackageCapabilityFactory}
 * when the nasdanika-core capability module is available on the class path.
 */
public class JsonSchemaEPackageResourceSetCapabilityFactory {

/**
 * Accesses {@link JsonSchemaPackage#eINSTANCE} to trigger its registration
 * with the EMF global EPackage registry, making it available to ResourceSets.
 */
public static void register() {
@SuppressWarnings("unused")
JsonSchemaPackage pkg = JsonSchemaPackage.eINSTANCE;
}

}
