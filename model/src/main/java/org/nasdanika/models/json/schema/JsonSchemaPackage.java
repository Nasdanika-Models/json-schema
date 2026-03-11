package org.nasdanika.models.json.schema;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 *
 * @see org.nasdanika.models.json.schema.JsonSchemaFactory
 * @generated
 */
public interface JsonSchemaPackage extends EPackage {

	/**
	 * The package name.
	 * @generated
	 */
	String eNAME = "jsonschema";

	/**
	 * The package namespace URI.
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/json-schema";

	/**
	 * The package namespace name.
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.json.schema";

	/**
	 * The singleton instance of the package.
	 * @generated
	 */
	JsonSchemaPackage eINSTANCE = org.nasdanika.models.json.schema.impl.JsonSchemaPackageImpl.init();

	// =========================================================================
	// Schema class
	// =========================================================================

	/** The meta object id for the Schema class. @generated */
	int SCHEMA = 0;

	/** Feature id for Schema schemaVersion. @generated */
	int SCHEMA__SCHEMA_VERSION = 0;
	/** Feature id for Schema id. @generated */
	int SCHEMA__ID = 1;
	/** Feature id for Schema anchor. @generated */
	int SCHEMA__ANCHOR = 2;
	/** Feature id for Schema dynamicAnchor. @generated */
	int SCHEMA__DYNAMIC_ANCHOR = 3;
	/** Feature id for Schema ref. @generated */
	int SCHEMA__REF = 4;
	/** Feature id for Schema dynamicRef. @generated */
	int SCHEMA__DYNAMIC_REF = 5;
	/** Feature id for Schema comment. @generated */
	int SCHEMA__COMMENT = 6;
	/** Feature id for Schema defs. @generated */
	int SCHEMA__DEFS = 7;
	/** Feature id for Schema booleanValue. @generated */
	int SCHEMA__BOOLEAN_VALUE = 8;
	/** Feature id for Schema types. @generated */
	int SCHEMA__TYPES = 9;
	/** Feature id for Schema const. @generated */
	int SCHEMA__CONST = 10;
	/** Feature id for Schema enum. @generated */
	int SCHEMA__ENUM = 11;
	/** Feature id for Schema minimum. @generated */
	int SCHEMA__MINIMUM = 12;
	/** Feature id for Schema maximum. @generated */
	int SCHEMA__MAXIMUM = 13;
	/** Feature id for Schema exclusiveMinimum. @generated */
	int SCHEMA__EXCLUSIVE_MINIMUM = 14;
	/** Feature id for Schema exclusiveMaximum. @generated */
	int SCHEMA__EXCLUSIVE_MAXIMUM = 15;
	/** Feature id for Schema multipleOf. @generated */
	int SCHEMA__MULTIPLE_OF = 16;
	/** Feature id for Schema minLength. @generated */
	int SCHEMA__MIN_LENGTH = 17;
	/** Feature id for Schema maxLength. @generated */
	int SCHEMA__MAX_LENGTH = 18;
	/** Feature id for Schema pattern. @generated */
	int SCHEMA__PATTERN = 19;
	/** Feature id for Schema minItems. @generated */
	int SCHEMA__MIN_ITEMS = 20;
	/** Feature id for Schema maxItems. @generated */
	int SCHEMA__MAX_ITEMS = 21;
	/** Feature id for Schema uniqueItems. @generated */
	int SCHEMA__UNIQUE_ITEMS = 22;
	/** Feature id for Schema minContains. @generated */
	int SCHEMA__MIN_CONTAINS = 23;
	/** Feature id for Schema maxContains. @generated */
	int SCHEMA__MAX_CONTAINS = 24;
	/** Feature id for Schema required. @generated */
	int SCHEMA__REQUIRED = 25;
	/** Feature id for Schema minProperties. @generated */
	int SCHEMA__MIN_PROPERTIES = 26;
	/** Feature id for Schema maxProperties. @generated */
	int SCHEMA__MAX_PROPERTIES = 27;
	/** Feature id for Schema dependentRequired. @generated */
	int SCHEMA__DEPENDENT_REQUIRED = 28;
	/** Feature id for Schema allOf. @generated */
	int SCHEMA__ALL_OF = 29;
	/** Feature id for Schema anyOf. @generated */
	int SCHEMA__ANY_OF = 30;
	/** Feature id for Schema oneOf. @generated */
	int SCHEMA__ONE_OF = 31;
	/** Feature id for Schema not. @generated */
	int SCHEMA__NOT = 32;
	/** Feature id for Schema if. @generated */
	int SCHEMA__IF = 33;
	/** Feature id for Schema then. @generated */
	int SCHEMA__THEN = 34;
	/** Feature id for Schema else. @generated */
	int SCHEMA__ELSE = 35;
	/** Feature id for Schema properties. @generated */
	int SCHEMA__PROPERTIES = 36;
	/** Feature id for Schema patternProperties. @generated */
	int SCHEMA__PATTERN_PROPERTIES = 37;
	/** Feature id for Schema additionalProperties. @generated */
	int SCHEMA__ADDITIONAL_PROPERTIES = 38;
	/** Feature id for Schema additionalPropertiesBoolean. @generated */
	int SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN = 39;
	/** Feature id for Schema unevaluatedProperties. @generated */
	int SCHEMA__UNEVALUATED_PROPERTIES = 40;
	/** Feature id for Schema unevaluatedPropertiesBoolean. @generated */
	int SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN = 41;
	/** Feature id for Schema dependentSchemas. @generated */
	int SCHEMA__DEPENDENT_SCHEMAS = 42;
	/** Feature id for Schema items. @generated */
	int SCHEMA__ITEMS = 43;
	/** Feature id for Schema itemsBoolean. @generated */
	int SCHEMA__ITEMS_BOOLEAN = 44;
	/** Feature id for Schema prefixItems. @generated */
	int SCHEMA__PREFIX_ITEMS = 45;
	/** Feature id for Schema contains. @generated */
	int SCHEMA__CONTAINS = 46;
	/** Feature id for Schema unevaluatedItems. @generated */
	int SCHEMA__UNEVALUATED_ITEMS = 47;
	/** Feature id for Schema title. @generated */
	int SCHEMA__TITLE = 48;
	/** Feature id for Schema description. @generated */
	int SCHEMA__DESCRIPTION = 49;
	/** Feature id for Schema default. @generated */
	int SCHEMA__DEFAULT = 50;
	/** Feature id for Schema deprecated. @generated */
	int SCHEMA__DEPRECATED = 51;
	/** Feature id for Schema readOnly. @generated */
	int SCHEMA__READ_ONLY = 52;
	/** Feature id for Schema writeOnly. @generated */
	int SCHEMA__WRITE_ONLY = 53;
	/** Feature id for Schema examples. @generated */
	int SCHEMA__EXAMPLES = 54;
	/** Feature id for Schema format. @generated */
	int SCHEMA__FORMAT = 55;
	/** Feature id for Schema contentEncoding. @generated */
	int SCHEMA__CONTENT_ENCODING = 56;
	/** Feature id for Schema contentMediaType. @generated */
	int SCHEMA__CONTENT_MEDIA_TYPE = 57;
	/** Feature id for Schema contentSchema. @generated */
	int SCHEMA__CONTENT_SCHEMA = 58;

	/** The number of structural features of the Schema class. @generated */
	int SCHEMA_FEATURE_COUNT = 59;

	// =========================================================================
	// SchemaEntry class
	// =========================================================================

	/** The meta object id for the SchemaEntry class. @generated */
	int SCHEMA_ENTRY = 1;

	/** Feature id for SchemaEntry key. @generated */
	int SCHEMA_ENTRY__KEY = 0;
	/** Feature id for SchemaEntry value. @generated */
	int SCHEMA_ENTRY__VALUE = 1;

	/** The number of structural features of the SchemaEntry class. @generated */
	int SCHEMA_ENTRY_FEATURE_COUNT = 2;

	// =========================================================================
	// StringListEntry class
	// =========================================================================

	/** The meta object id for the StringListEntry class. @generated */
	int STRING_LIST_ENTRY = 2;

	/** Feature id for StringListEntry key. @generated */
	int STRING_LIST_ENTRY__KEY = 0;
	/** Feature id for StringListEntry values. @generated */
	int STRING_LIST_ENTRY__VALUES = 1;

	/** The number of structural features of the StringListEntry class. @generated */
	int STRING_LIST_ENTRY_FEATURE_COUNT = 2;

	// =========================================================================
	// Type enum
	// =========================================================================

	/** The meta object id for the Type enum. @generated */
	int TYPE = 3;

	// =========================================================================
	// Literals
	// =========================================================================

	/**
	 * A literal access to all static features.
	 * @generated
	 */
	interface Literals {

		/** The meta object literal for the Schema class. @generated */
		EClass SCHEMA = eINSTANCE.getSchemaClass();

		/** The meta object literal for the schemaVersion feature. @generated */
		EAttribute SCHEMA__SCHEMA_VERSION = eINSTANCE.getSchema_SchemaVersion();
		/** The meta object literal for the id feature. @generated */
		EAttribute SCHEMA__ID = eINSTANCE.getSchema_Id();
		/** The meta object literal for the anchor feature. @generated */
		EAttribute SCHEMA__ANCHOR = eINSTANCE.getSchema_Anchor();
		/** The meta object literal for the dynamicAnchor feature. @generated */
		EAttribute SCHEMA__DYNAMIC_ANCHOR = eINSTANCE.getSchema_DynamicAnchor();
		/** The meta object literal for the ref feature. @generated */
		EAttribute SCHEMA__REF = eINSTANCE.getSchema_Ref();
		/** The meta object literal for the dynamicRef feature. @generated */
		EAttribute SCHEMA__DYNAMIC_REF = eINSTANCE.getSchema_DynamicRef();
		/** The meta object literal for the comment feature. @generated */
		EAttribute SCHEMA__COMMENT = eINSTANCE.getSchema_Comment();
		/** The meta object literal for the defs feature. @generated */
		EReference SCHEMA__DEFS = eINSTANCE.getSchema_Defs();
		/** The meta object literal for the booleanValue feature. @generated */
		EAttribute SCHEMA__BOOLEAN_VALUE = eINSTANCE.getSchema_BooleanValue();
		/** The meta object literal for the types feature. @generated */
		EAttribute SCHEMA__TYPES = eINSTANCE.getSchema_Types();
		/** The meta object literal for the const feature. @generated */
		EAttribute SCHEMA__CONST = eINSTANCE.getSchema_Const();
		/** The meta object literal for the enum feature. @generated */
		EAttribute SCHEMA__ENUM = eINSTANCE.getSchema_Enum();
		/** The meta object literal for the minimum feature. @generated */
		EAttribute SCHEMA__MINIMUM = eINSTANCE.getSchema_Minimum();
		/** The meta object literal for the maximum feature. @generated */
		EAttribute SCHEMA__MAXIMUM = eINSTANCE.getSchema_Maximum();
		/** The meta object literal for the exclusiveMinimum feature. @generated */
		EAttribute SCHEMA__EXCLUSIVE_MINIMUM = eINSTANCE.getSchema_ExclusiveMinimum();
		/** The meta object literal for the exclusiveMaximum feature. @generated */
		EAttribute SCHEMA__EXCLUSIVE_MAXIMUM = eINSTANCE.getSchema_ExclusiveMaximum();
		/** The meta object literal for the multipleOf feature. @generated */
		EAttribute SCHEMA__MULTIPLE_OF = eINSTANCE.getSchema_MultipleOf();
		/** The meta object literal for the minLength feature. @generated */
		EAttribute SCHEMA__MIN_LENGTH = eINSTANCE.getSchema_MinLength();
		/** The meta object literal for the maxLength feature. @generated */
		EAttribute SCHEMA__MAX_LENGTH = eINSTANCE.getSchema_MaxLength();
		/** The meta object literal for the pattern feature. @generated */
		EAttribute SCHEMA__PATTERN = eINSTANCE.getSchema_Pattern();
		/** The meta object literal for the minItems feature. @generated */
		EAttribute SCHEMA__MIN_ITEMS = eINSTANCE.getSchema_MinItems();
		/** The meta object literal for the maxItems feature. @generated */
		EAttribute SCHEMA__MAX_ITEMS = eINSTANCE.getSchema_MaxItems();
		/** The meta object literal for the uniqueItems feature. @generated */
		EAttribute SCHEMA__UNIQUE_ITEMS = eINSTANCE.getSchema_UniqueItems();
		/** The meta object literal for the minContains feature. @generated */
		EAttribute SCHEMA__MIN_CONTAINS = eINSTANCE.getSchema_MinContains();
		/** The meta object literal for the maxContains feature. @generated */
		EAttribute SCHEMA__MAX_CONTAINS = eINSTANCE.getSchema_MaxContains();
		/** The meta object literal for the required feature. @generated */
		EAttribute SCHEMA__REQUIRED = eINSTANCE.getSchema_Required();
		/** The meta object literal for the minProperties feature. @generated */
		EAttribute SCHEMA__MIN_PROPERTIES = eINSTANCE.getSchema_MinProperties();
		/** The meta object literal for the maxProperties feature. @generated */
		EAttribute SCHEMA__MAX_PROPERTIES = eINSTANCE.getSchema_MaxProperties();
		/** The meta object literal for the dependentRequired feature. @generated */
		EReference SCHEMA__DEPENDENT_REQUIRED = eINSTANCE.getSchema_DependentRequired();
		/** The meta object literal for the allOf feature. @generated */
		EReference SCHEMA__ALL_OF = eINSTANCE.getSchema_AllOf();
		/** The meta object literal for the anyOf feature. @generated */
		EReference SCHEMA__ANY_OF = eINSTANCE.getSchema_AnyOf();
		/** The meta object literal for the oneOf feature. @generated */
		EReference SCHEMA__ONE_OF = eINSTANCE.getSchema_OneOf();
		/** The meta object literal for the not feature. @generated */
		EReference SCHEMA__NOT = eINSTANCE.getSchema_Not();
		/** The meta object literal for the if feature. @generated */
		EReference SCHEMA__IF = eINSTANCE.getSchema_If();
		/** The meta object literal for the then feature. @generated */
		EReference SCHEMA__THEN = eINSTANCE.getSchema_Then();
		/** The meta object literal for the else feature. @generated */
		EReference SCHEMA__ELSE = eINSTANCE.getSchema_Else();
		/** The meta object literal for the properties feature. @generated */
		EReference SCHEMA__PROPERTIES = eINSTANCE.getSchema_Properties();
		/** The meta object literal for the patternProperties feature. @generated */
		EReference SCHEMA__PATTERN_PROPERTIES = eINSTANCE.getSchema_PatternProperties();
		/** The meta object literal for the additionalProperties feature. @generated */
		EReference SCHEMA__ADDITIONAL_PROPERTIES = eINSTANCE.getSchema_AdditionalProperties();
		/** The meta object literal for the additionalPropertiesBoolean feature. @generated */
		EAttribute SCHEMA__ADDITIONAL_PROPERTIES_BOOLEAN = eINSTANCE.getSchema_AdditionalPropertiesBoolean();
		/** The meta object literal for the unevaluatedProperties feature. @generated */
		EReference SCHEMA__UNEVALUATED_PROPERTIES = eINSTANCE.getSchema_UnevaluatedProperties();
		/** The meta object literal for the unevaluatedPropertiesBoolean feature. @generated */
		EAttribute SCHEMA__UNEVALUATED_PROPERTIES_BOOLEAN = eINSTANCE.getSchema_UnevaluatedPropertiesBoolean();
		/** The meta object literal for the dependentSchemas feature. @generated */
		EReference SCHEMA__DEPENDENT_SCHEMAS = eINSTANCE.getSchema_DependentSchemas();
		/** The meta object literal for the items feature. @generated */
		EReference SCHEMA__ITEMS = eINSTANCE.getSchema_Items();
		/** The meta object literal for the itemsBoolean feature. @generated */
		EAttribute SCHEMA__ITEMS_BOOLEAN = eINSTANCE.getSchema_ItemsBoolean();
		/** The meta object literal for the prefixItems feature. @generated */
		EReference SCHEMA__PREFIX_ITEMS = eINSTANCE.getSchema_PrefixItems();
		/** The meta object literal for the contains feature. @generated */
		EReference SCHEMA__CONTAINS = eINSTANCE.getSchema_Contains();
		/** The meta object literal for the unevaluatedItems feature. @generated */
		EReference SCHEMA__UNEVALUATED_ITEMS = eINSTANCE.getSchema_UnevaluatedItems();
		/** The meta object literal for the title feature. @generated */
		EAttribute SCHEMA__TITLE = eINSTANCE.getSchema_Title();
		/** The meta object literal for the description feature. @generated */
		EAttribute SCHEMA__DESCRIPTION = eINSTANCE.getSchema_Description();
		/** The meta object literal for the default feature. @generated */
		EAttribute SCHEMA__DEFAULT = eINSTANCE.getSchema_Default();
		/** The meta object literal for the deprecated feature. @generated */
		EAttribute SCHEMA__DEPRECATED = eINSTANCE.getSchema_Deprecated();
		/** The meta object literal for the readOnly feature. @generated */
		EAttribute SCHEMA__READ_ONLY = eINSTANCE.getSchema_ReadOnly();
		/** The meta object literal for the writeOnly feature. @generated */
		EAttribute SCHEMA__WRITE_ONLY = eINSTANCE.getSchema_WriteOnly();
		/** The meta object literal for the examples feature. @generated */
		EAttribute SCHEMA__EXAMPLES = eINSTANCE.getSchema_Examples();
		/** The meta object literal for the format feature. @generated */
		EAttribute SCHEMA__FORMAT = eINSTANCE.getSchema_Format();
		/** The meta object literal for the contentEncoding feature. @generated */
		EAttribute SCHEMA__CONTENT_ENCODING = eINSTANCE.getSchema_ContentEncoding();
		/** The meta object literal for the contentMediaType feature. @generated */
		EAttribute SCHEMA__CONTENT_MEDIA_TYPE = eINSTANCE.getSchema_ContentMediaType();
		/** The meta object literal for the contentSchema feature. @generated */
		EReference SCHEMA__CONTENT_SCHEMA = eINSTANCE.getSchema_ContentSchema();

		/** The meta object literal for the SchemaEntry class. @generated */
		EClass SCHEMA_ENTRY = eINSTANCE.getSchemaEntryClass();
		/** The meta object literal for the SchemaEntry key feature. @generated */
		EAttribute SCHEMA_ENTRY__KEY = eINSTANCE.getSchemaEntry_Key();
		/** The meta object literal for the SchemaEntry value feature. @generated */
		EReference SCHEMA_ENTRY__VALUE = eINSTANCE.getSchemaEntry_Value();

		/** The meta object literal for the StringListEntry class. @generated */
		EClass STRING_LIST_ENTRY = eINSTANCE.getStringListEntryClass();
		/** The meta object literal for the StringListEntry key feature. @generated */
		EAttribute STRING_LIST_ENTRY__KEY = eINSTANCE.getStringListEntry_Key();
		/** The meta object literal for the StringListEntry values feature. @generated */
		EAttribute STRING_LIST_ENTRY__VALUES = eINSTANCE.getStringListEntry_Values();

		/** The meta object literal for the Type enum. @generated */
		EEnum TYPE = eINSTANCE.getTypeEnum();
	}

	// =========================================================================
	// Accessor methods
	// =========================================================================

	/** Returns the meta object for class Schema. @generated */
	EClass getSchemaClass();

	/** Returns the meta object for the schemaVersion attribute of Schema. @generated */
	EAttribute getSchema_SchemaVersion();
	/** Returns the meta object for the id attribute of Schema. @generated */
	EAttribute getSchema_Id();
	/** Returns the meta object for the anchor attribute of Schema. @generated */
	EAttribute getSchema_Anchor();
	/** Returns the meta object for the dynamicAnchor attribute of Schema. @generated */
	EAttribute getSchema_DynamicAnchor();
	/** Returns the meta object for the ref attribute of Schema. @generated */
	EAttribute getSchema_Ref();
	/** Returns the meta object for the dynamicRef attribute of Schema. @generated */
	EAttribute getSchema_DynamicRef();
	/** Returns the meta object for the comment attribute of Schema. @generated */
	EAttribute getSchema_Comment();
	/** Returns the meta object for the defs reference of Schema. @generated */
	EReference getSchema_Defs();
	/** Returns the meta object for the booleanValue attribute of Schema. @generated */
	EAttribute getSchema_BooleanValue();
	/** Returns the meta object for the types attribute of Schema. @generated */
	EAttribute getSchema_Types();
	/** Returns the meta object for the const attribute of Schema. @generated */
	EAttribute getSchema_Const();
	/** Returns the meta object for the enum attribute of Schema. @generated */
	EAttribute getSchema_Enum();
	/** Returns the meta object for the minimum attribute of Schema. @generated */
	EAttribute getSchema_Minimum();
	/** Returns the meta object for the maximum attribute of Schema. @generated */
	EAttribute getSchema_Maximum();
	/** Returns the meta object for the exclusiveMinimum attribute of Schema. @generated */
	EAttribute getSchema_ExclusiveMinimum();
	/** Returns the meta object for the exclusiveMaximum attribute of Schema. @generated */
	EAttribute getSchema_ExclusiveMaximum();
	/** Returns the meta object for the multipleOf attribute of Schema. @generated */
	EAttribute getSchema_MultipleOf();
	/** Returns the meta object for the minLength attribute of Schema. @generated */
	EAttribute getSchema_MinLength();
	/** Returns the meta object for the maxLength attribute of Schema. @generated */
	EAttribute getSchema_MaxLength();
	/** Returns the meta object for the pattern attribute of Schema. @generated */
	EAttribute getSchema_Pattern();
	/** Returns the meta object for the minItems attribute of Schema. @generated */
	EAttribute getSchema_MinItems();
	/** Returns the meta object for the maxItems attribute of Schema. @generated */
	EAttribute getSchema_MaxItems();
	/** Returns the meta object for the uniqueItems attribute of Schema. @generated */
	EAttribute getSchema_UniqueItems();
	/** Returns the meta object for the minContains attribute of Schema. @generated */
	EAttribute getSchema_MinContains();
	/** Returns the meta object for the maxContains attribute of Schema. @generated */
	EAttribute getSchema_MaxContains();
	/** Returns the meta object for the required attribute of Schema. @generated */
	EAttribute getSchema_Required();
	/** Returns the meta object for the minProperties attribute of Schema. @generated */
	EAttribute getSchema_MinProperties();
	/** Returns the meta object for the maxProperties attribute of Schema. @generated */
	EAttribute getSchema_MaxProperties();
	/** Returns the meta object for the dependentRequired reference of Schema. @generated */
	EReference getSchema_DependentRequired();
	/** Returns the meta object for the allOf reference of Schema. @generated */
	EReference getSchema_AllOf();
	/** Returns the meta object for the anyOf reference of Schema. @generated */
	EReference getSchema_AnyOf();
	/** Returns the meta object for the oneOf reference of Schema. @generated */
	EReference getSchema_OneOf();
	/** Returns the meta object for the not reference of Schema. @generated */
	EReference getSchema_Not();
	/** Returns the meta object for the if reference of Schema. @generated */
	EReference getSchema_If();
	/** Returns the meta object for the then reference of Schema. @generated */
	EReference getSchema_Then();
	/** Returns the meta object for the else reference of Schema. @generated */
	EReference getSchema_Else();
	/** Returns the meta object for the properties reference of Schema. @generated */
	EReference getSchema_Properties();
	/** Returns the meta object for the patternProperties reference of Schema. @generated */
	EReference getSchema_PatternProperties();
	/** Returns the meta object for the additionalProperties reference of Schema. @generated */
	EReference getSchema_AdditionalProperties();
	/** Returns the meta object for the additionalPropertiesBoolean attribute of Schema. @generated */
	EAttribute getSchema_AdditionalPropertiesBoolean();
	/** Returns the meta object for the unevaluatedProperties reference of Schema. @generated */
	EReference getSchema_UnevaluatedProperties();
	/** Returns the meta object for the unevaluatedPropertiesBoolean attribute of Schema. @generated */
	EAttribute getSchema_UnevaluatedPropertiesBoolean();
	/** Returns the meta object for the dependentSchemas reference of Schema. @generated */
	EReference getSchema_DependentSchemas();
	/** Returns the meta object for the items reference of Schema. @generated */
	EReference getSchema_Items();
	/** Returns the meta object for the itemsBoolean attribute of Schema. @generated */
	EAttribute getSchema_ItemsBoolean();
	/** Returns the meta object for the prefixItems reference of Schema. @generated */
	EReference getSchema_PrefixItems();
	/** Returns the meta object for the contains reference of Schema. @generated */
	EReference getSchema_Contains();
	/** Returns the meta object for the unevaluatedItems reference of Schema. @generated */
	EReference getSchema_UnevaluatedItems();
	/** Returns the meta object for the title attribute of Schema. @generated */
	EAttribute getSchema_Title();
	/** Returns the meta object for the description attribute of Schema. @generated */
	EAttribute getSchema_Description();
	/** Returns the meta object for the default attribute of Schema. @generated */
	EAttribute getSchema_Default();
	/** Returns the meta object for the deprecated attribute of Schema. @generated */
	EAttribute getSchema_Deprecated();
	/** Returns the meta object for the readOnly attribute of Schema. @generated */
	EAttribute getSchema_ReadOnly();
	/** Returns the meta object for the writeOnly attribute of Schema. @generated */
	EAttribute getSchema_WriteOnly();
	/** Returns the meta object for the examples attribute of Schema. @generated */
	EAttribute getSchema_Examples();
	/** Returns the meta object for the format attribute of Schema. @generated */
	EAttribute getSchema_Format();
	/** Returns the meta object for the contentEncoding attribute of Schema. @generated */
	EAttribute getSchema_ContentEncoding();
	/** Returns the meta object for the contentMediaType attribute of Schema. @generated */
	EAttribute getSchema_ContentMediaType();
	/** Returns the meta object for the contentSchema reference of Schema. @generated */
	EReference getSchema_ContentSchema();

	/** Returns the meta object for class SchemaEntry. @generated */
	EClass getSchemaEntryClass();
	/** Returns the meta object for the key attribute of SchemaEntry. @generated */
	EAttribute getSchemaEntry_Key();
	/** Returns the meta object for the value reference of SchemaEntry. @generated */
	EReference getSchemaEntry_Value();

	/** Returns the meta object for class StringListEntry. @generated */
	EClass getStringListEntryClass();
	/** Returns the meta object for the key attribute of StringListEntry. @generated */
	EAttribute getStringListEntry_Key();
	/** Returns the meta object for the values attribute of StringListEntry. @generated */
	EAttribute getStringListEntry_Values();

	/** Returns the meta object for enum Type. @generated */
	EEnum getTypeEnum();

	/** Returns the factory that creates the instances of the model. @generated */
	JsonSchemaFactory getJsonSchemaFactory();

} //JsonSchemaPackage
