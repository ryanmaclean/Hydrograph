
/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package hydrograph.engine.jaxb.itffw;

import hydrograph.engine.jaxb.commontypes.TypeBaseRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type-fixedwidth-record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="type-fixedwidth-record">
 *   &lt;complexContent>
 *     &lt;restriction base="{hydrograph/engine/jaxb/commontypes}type-base-record">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="field" type="{hydrograph/engine/jaxb/itffw}type-fixedwidth-field"/>
 *         &lt;element name="record" type="{hydrograph/engine/jaxb/itffw}type-fixedwidth-record"/>
 *         &lt;element name="includeExternalSchema" type="{hydrograph/engine/jaxb/commontypes}type-external-schema" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "type-fixedwidth-record", namespace = "hydrograph/engine/jaxb/itffw")
public class TypeFixedwidthRecord
    extends TypeBaseRecord
{


}
