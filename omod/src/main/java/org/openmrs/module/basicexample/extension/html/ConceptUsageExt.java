package org.openmrs.module.basicexample.extension.html;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.ConceptUsage;
import org.openmrs.ConceptUsageExtension;

public class ConceptUsageExt extends ConceptUsageExtension {

	@Override
	public String getHeader() {
		return "Basic Examples using Concept";
	}
	
	@Override
	public List<ConceptUsage> getConceptUsage() {
		List<ConceptUsage> usage = new ArrayList<ConceptUsage>();
		usage.add(new ConceptUsage("First Usage", "/index.html"));
		usage.add(new ConceptUsage("Second Usage", "/index.html"));
		return usage;
	}
	
}
