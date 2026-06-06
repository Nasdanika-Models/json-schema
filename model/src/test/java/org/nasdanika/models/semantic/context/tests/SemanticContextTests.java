package org.nasdanika.models.semantic.context.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.junit.jupiter.api.Test;

public class SemanticContextTests {

	@Test
	public void testLoadEcoreModel() throws Exception {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
			.getExtensionToFactoryMap()
			.put("ecore", new EcoreResourceFactoryImpl());

		File ecoreFile = new File("model/semantic-context.ecore");
		URI uri = URI.createFileURI(ecoreFile.getAbsolutePath());
		Resource resource = resourceSet.getResource(uri, true);

		assertNotNull(resource, "Resource should not be null");
		assertEquals(1, resource.getContents().size(), "Resource should have exactly one top-level element");

		EPackage ePackage = (EPackage) resource.getContents().get(0);
		assertEquals("semanticContext", ePackage.getName(), "Package name should be 'semanticContext'");
		assertEquals("ecore://nasdanika.org/models/semantic-context", ePackage.getNsURI(), "Namespace URI should match");

		String[] expectedClasses = {
			"ContextModel", "SourceModel", "ElementContext", "FeatureContext",
			"OperationContext", "TypeMapping", "CrossModelLink", "DriftRule"
		};
		for (String className : expectedClasses) {
			EClass eClass = (EClass) ePackage.getEClassifier(className);
			assertNotNull(eClass, "EClass '" + className + "' should exist in the package");
		}
	}

}

