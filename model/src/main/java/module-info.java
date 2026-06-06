import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.json.schema.util.JsonSchemaEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.json.schema {
	
	exports org.nasdanika.models.json.schema;
	exports org.nasdanika.models.json.schema.impl;
	exports org.nasdanika.models.json.schema.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with JsonSchemaEPackageResourceSetCapabilityFactory;
	
}