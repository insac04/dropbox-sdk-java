/* DO NOT EDIT */
/* This file was generated from files_properties.stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.stone.StoneSerializers;
import com.dropbox.core.stone.UnionSerializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

/**
 * This class is a tagged union.  Tagged unions instances are always associated
 * to a specific tag.  This means only one of the {@code isAbc()} methods will
 * return {@code true}. You can use {@link #tag()} to determine the tag
 * associated with this instance.
 */
public final class UpdatePropertiesError {
    // union UpdatePropertiesError

    /**
     * Discriminating tag type for {@link UpdatePropertiesError}.
     */
    public enum Tag {
        /**
         * Property template does not exist for given identifier.
         */
        TEMPLATE_NOT_FOUND, // String
        /**
         * You do not have the permissions to modify this property template.
         */
        RESTRICTED_CONTENT,
        /**
         * An unspecified error.
         */
        OTHER,
        PATH, // LookupError
        /**
         * A field value in this property group is too large.
         */
        PROPERTY_FIELD_TOO_LARGE,
        /**
         * The property group specified does not conform to the property
         * template.
         */
        DOES_NOT_FIT_TEMPLATE,
        PROPERTY_GROUP_LOOKUP; // LookUpPropertiesError
    }

    /**
     * You do not have the permissions to modify this property template.
     */
    public static final UpdatePropertiesError RESTRICTED_CONTENT = new UpdatePropertiesError(Tag.RESTRICTED_CONTENT, null, null, null);
    /**
     * An unspecified error.
     */
    public static final UpdatePropertiesError OTHER = new UpdatePropertiesError(Tag.OTHER, null, null, null);
    /**
     * A field value in this property group is too large.
     */
    public static final UpdatePropertiesError PROPERTY_FIELD_TOO_LARGE = new UpdatePropertiesError(Tag.PROPERTY_FIELD_TOO_LARGE, null, null, null);
    /**
     * The property group specified does not conform to the property template.
     */
    public static final UpdatePropertiesError DOES_NOT_FIT_TEMPLATE = new UpdatePropertiesError(Tag.DOES_NOT_FIT_TEMPLATE, null, null, null);

    private final Tag tag;
    private final String templateNotFoundValue;
    private final LookupError pathValue;
    private final LookUpPropertiesError propertyGroupLookupValue;

    /**
     *
     * @param tag  Discriminating tag for this instance.
     */
    private UpdatePropertiesError(Tag tag, String templateNotFoundValue, LookupError pathValue, LookUpPropertiesError propertyGroupLookupValue) {
        this.tag = tag;
        this.templateNotFoundValue = templateNotFoundValue;
        this.pathValue = pathValue;
        this.propertyGroupLookupValue = propertyGroupLookupValue;
    }

    /**
     * Returns the tag for this instance.
     *
     * <p> This class is a tagged union.  Tagged unions instances are always
     * associated to a specific tag.  This means only one of the {@code isXyz()}
     * methods will return {@code true}. Callers are recommended to use the tag
     * value in a {@code switch} statement to properly handle the different
     * values for this {@code UpdatePropertiesError}. </p>
     *
     * @return the tag for this instance.
     */
    public Tag tag() {
        return tag;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#TEMPLATE_NOT_FOUND}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#TEMPLATE_NOT_FOUND}, {@code false} otherwise.
     */
    public boolean isTemplateNotFound() {
        return this.tag == Tag.TEMPLATE_NOT_FOUND;
    }

    /**
     * Returns an instance of {@code UpdatePropertiesError} that has its tag set
     * to {@link Tag#TEMPLATE_NOT_FOUND}.
     *
     * <p> Property template does not exist for given identifier. </p>
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code UpdatePropertiesError} with its tag set to
     *     {@link Tag#TEMPLATE_NOT_FOUND}.
     *
     * @throws IllegalArgumentException  if {@code value} is shorter than 1,
     *     does not match pattern "{@code (/|ptid:).*}", or is {@code null}.
     */
    public static UpdatePropertiesError templateNotFound(String value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        if (value.length() < 1) {
            throw new IllegalArgumentException("String is shorter than 1");
        }
        if (!java.util.regex.Pattern.matches("(/|ptid:).*", value)) {
            throw new IllegalArgumentException("String does not match pattern");
        }
        return new UpdatePropertiesError(Tag.TEMPLATE_NOT_FOUND, value, null, null);
    }

    /**
     * Property template does not exist for given identifier.
     *
     * <p> This instance must be tagged as {@link Tag#TEMPLATE_NOT_FOUND}. </p>
     *
     * @return The {@link UpdatePropertiesError#templateNotFound} value
     *     associated with this instance if {@link #isTemplateNotFound} is
     *     {@code true}.
     *
     * @throws IllegalStateException  If {@link #isTemplateNotFound} is {@code
     *     false}.
     */
    public String getTemplateNotFoundValue() {
        if (this.tag != Tag.TEMPLATE_NOT_FOUND) {
            throw new IllegalStateException("Invalid tag: required Tag.TEMPLATE_NOT_FOUND, but was Tag." + tag.name());
        }
        return templateNotFoundValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#RESTRICTED_CONTENT}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#RESTRICTED_CONTENT}, {@code false} otherwise.
     */
    public boolean isRestrictedContent() {
        return this.tag == Tag.RESTRICTED_CONTENT;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#OTHER},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#OTHER},
     *     {@code false} otherwise.
     */
    public boolean isOther() {
        return this.tag == Tag.OTHER;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link Tag#PATH},
     * {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link Tag#PATH},
     *     {@code false} otherwise.
     */
    public boolean isPath() {
        return this.tag == Tag.PATH;
    }

    /**
     * Returns an instance of {@code UpdatePropertiesError} that has its tag set
     * to {@link Tag#PATH}.
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code UpdatePropertiesError} with its tag set to
     *     {@link Tag#PATH}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static UpdatePropertiesError path(LookupError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new UpdatePropertiesError(Tag.PATH, null, value, null);
    }

    /**
     * This instance must be tagged as {@link Tag#PATH}.
     *
     * @return The {@link UpdatePropertiesError#path} value associated with this
     *     instance if {@link #isPath} is {@code true}.
     *
     * @throws IllegalStateException  If {@link #isPath} is {@code false}.
     */
    public LookupError getPathValue() {
        if (this.tag != Tag.PATH) {
            throw new IllegalStateException("Invalid tag: required Tag.PATH, but was Tag." + tag.name());
        }
        return pathValue;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#PROPERTY_FIELD_TOO_LARGE}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#PROPERTY_FIELD_TOO_LARGE}, {@code false} otherwise.
     */
    public boolean isPropertyFieldTooLarge() {
        return this.tag == Tag.PROPERTY_FIELD_TOO_LARGE;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#DOES_NOT_FIT_TEMPLATE}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#DOES_NOT_FIT_TEMPLATE}, {@code false} otherwise.
     */
    public boolean isDoesNotFitTemplate() {
        return this.tag == Tag.DOES_NOT_FIT_TEMPLATE;
    }

    /**
     * Returns {@code true} if this instance has the tag {@link
     * Tag#PROPERTY_GROUP_LOOKUP}, {@code false} otherwise.
     *
     * @return {@code true} if this instance is tagged as {@link
     *     Tag#PROPERTY_GROUP_LOOKUP}, {@code false} otherwise.
     */
    public boolean isPropertyGroupLookup() {
        return this.tag == Tag.PROPERTY_GROUP_LOOKUP;
    }

    /**
     * Returns an instance of {@code UpdatePropertiesError} that has its tag set
     * to {@link Tag#PROPERTY_GROUP_LOOKUP}.
     *
     * @param value  value to assign to this instance.
     *
     * @return Instance of {@code UpdatePropertiesError} with its tag set to
     *     {@link Tag#PROPERTY_GROUP_LOOKUP}.
     *
     * @throws IllegalArgumentException  if {@code value} is {@code null}.
     */
    public static UpdatePropertiesError propertyGroupLookup(LookUpPropertiesError value) {
        if (value == null) {
            throw new IllegalArgumentException("Value is null");
        }
        return new UpdatePropertiesError(Tag.PROPERTY_GROUP_LOOKUP, null, null, value);
    }

    /**
     * This instance must be tagged as {@link Tag#PROPERTY_GROUP_LOOKUP}.
     *
     * @return The {@link UpdatePropertiesError#propertyGroupLookup} value
     *     associated with this instance if {@link #isPropertyGroupLookup} is
     *     {@code true}.
     *
     * @throws IllegalStateException  If {@link #isPropertyGroupLookup} is
     *     {@code false}.
     */
    public LookUpPropertiesError getPropertyGroupLookupValue() {
        if (this.tag != Tag.PROPERTY_GROUP_LOOKUP) {
            throw new IllegalStateException("Invalid tag: required Tag.PROPERTY_GROUP_LOOKUP, but was Tag." + tag.name());
        }
        return propertyGroupLookupValue;
    }

    @Override
    public int hashCode() {
        int hash = java.util.Arrays.hashCode(new Object [] {
            tag,
            templateNotFoundValue,
            pathValue,
            propertyGroupLookupValue
        });
        hash = (31 * super.hashCode()) + hash;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj instanceof UpdatePropertiesError) {
            UpdatePropertiesError other = (UpdatePropertiesError) obj;
            if (this.tag != other.tag) {
                return false;
            }
            switch (tag) {
                case TEMPLATE_NOT_FOUND:
                    return (this.templateNotFoundValue == other.templateNotFoundValue) || (this.templateNotFoundValue.equals(other.templateNotFoundValue));
                case RESTRICTED_CONTENT:
                    return true;
                case OTHER:
                    return true;
                case PATH:
                    return (this.pathValue == other.pathValue) || (this.pathValue.equals(other.pathValue));
                case PROPERTY_FIELD_TOO_LARGE:
                    return true;
                case DOES_NOT_FIT_TEMPLATE:
                    return true;
                case PROPERTY_GROUP_LOOKUP:
                    return (this.propertyGroupLookupValue == other.propertyGroupLookupValue) || (this.propertyGroupLookupValue.equals(other.propertyGroupLookupValue));
                default:
                    return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return Serializer.INSTANCE.serialize(this, false);
    }

    /**
     * Returns a String representation of this object formatted for easier
     * readability.
     *
     * <p> The returned String may contain newlines. </p>
     *
     * @return Formatted, multiline String representation of this object
     */
    public String toStringMultiline() {
        return Serializer.INSTANCE.serialize(this, true);
    }

    /**
     * For internal use only.
     */
    static final class Serializer extends UnionSerializer<UpdatePropertiesError> {
        public static final Serializer INSTANCE = new Serializer();

        @Override
        public void serialize(UpdatePropertiesError value, JsonGenerator g) throws IOException, JsonGenerationException {
            switch (value.tag()) {
                case TEMPLATE_NOT_FOUND: {
                    g.writeStartObject();
                    writeTag("template_not_found", g);
                    g.writeFieldName("template_not_found");
                    StoneSerializers.string().serialize(value.templateNotFoundValue, g);
                    g.writeEndObject();
                    break;
                }
                case RESTRICTED_CONTENT: {
                    g.writeString("restricted_content");
                    break;
                }
                case OTHER: {
                    g.writeString("other");
                    break;
                }
                case PATH: {
                    g.writeStartObject();
                    writeTag("path", g);
                    g.writeFieldName("path");
                    LookupError.Serializer.INSTANCE.serialize(value.pathValue, g);
                    g.writeEndObject();
                    break;
                }
                case PROPERTY_FIELD_TOO_LARGE: {
                    g.writeString("property_field_too_large");
                    break;
                }
                case DOES_NOT_FIT_TEMPLATE: {
                    g.writeString("does_not_fit_template");
                    break;
                }
                case PROPERTY_GROUP_LOOKUP: {
                    g.writeStartObject();
                    writeTag("property_group_lookup", g);
                    g.writeFieldName("property_group_lookup");
                    LookUpPropertiesError.Serializer.INSTANCE.serialize(value.propertyGroupLookupValue, g);
                    g.writeEndObject();
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unrecognized tag: " + value.tag());
                }
            }
        }

        @Override
        public UpdatePropertiesError deserialize(JsonParser p) throws IOException, JsonParseException {
            UpdatePropertiesError value;
            boolean collapsed;
            String tag;
            if (p.getCurrentToken() == JsonToken.VALUE_STRING) {
                collapsed = true;
                tag = getStringValue(p);
                p.nextToken();
            }
            else {
                collapsed = false;
                expectStartObject(p);
                tag = readTag(p);
            }
            if (tag == null) {
                throw new JsonParseException(p, "Required field missing: " + TAG_FIELD);
            }
            else if ("template_not_found".equals(tag)) {
                String fieldValue = null;
                expectField("template_not_found", p);
                fieldValue = StoneSerializers.string().deserialize(p);
                value = UpdatePropertiesError.templateNotFound(fieldValue);
            }
            else if ("restricted_content".equals(tag)) {
                value = UpdatePropertiesError.RESTRICTED_CONTENT;
            }
            else if ("other".equals(tag)) {
                value = UpdatePropertiesError.OTHER;
            }
            else if ("path".equals(tag)) {
                LookupError fieldValue = null;
                expectField("path", p);
                fieldValue = LookupError.Serializer.INSTANCE.deserialize(p);
                value = UpdatePropertiesError.path(fieldValue);
            }
            else if ("property_field_too_large".equals(tag)) {
                value = UpdatePropertiesError.PROPERTY_FIELD_TOO_LARGE;
            }
            else if ("does_not_fit_template".equals(tag)) {
                value = UpdatePropertiesError.DOES_NOT_FIT_TEMPLATE;
            }
            else if ("property_group_lookup".equals(tag)) {
                LookUpPropertiesError fieldValue = null;
                expectField("property_group_lookup", p);
                fieldValue = LookUpPropertiesError.Serializer.INSTANCE.deserialize(p);
                value = UpdatePropertiesError.propertyGroupLookup(fieldValue);
            }
            else {
                throw new JsonParseException(p, "Unknown tag: " + tag);
            }
            if (!collapsed) {
                expectEndObject(p);
            }
            return value;
        }
    }
}
