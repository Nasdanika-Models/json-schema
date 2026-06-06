import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.json.schema.ecore.ECoreGenJsonSchemaProcessorsCapabilityFactory;

module org.nasdanika.models.json.schema.ecore {
		
	requires transitive org.nasdanika.models.json.schema;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.json.schema.ecore;
	opens org.nasdanika.models.json.schema.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenJsonSchemaProcessorsCapabilityFactory; 		
	
}
