package org.openmrs.module.basicexample.extension.html;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.ConceptUsage;
import org.openmrs.module.Extension;
import org.openmrs.module.web.extension.ConceptUsageExtension;

public class ConceptUsageExt extends ConceptUsageExtension {

	@Override
	public MEDIA_TYPE getMediaType() {
		return Extension.MEDIA_TYPE.html;
	}

	@Override
	public String getHeader() {
		return "Basic Examples using Concept";
	}
	
	public List<ConceptUsage> getConceptUsage() {
		List<ConceptUsage> usage = new ArrayList<ConceptUsage>();
		usage.add(new ConceptUsage("First Usage", "/index.html"));
		usage.add(new ConceptUsage("Second Usage", "/index.html"));
		return usage;
	}
	
}
