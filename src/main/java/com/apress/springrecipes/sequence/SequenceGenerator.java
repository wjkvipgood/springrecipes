package com.apress.springrecipes.sequence;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

public class SequenceGenerator {
	private String prefix;
	private String suffix;
	private int initial;
	private int counter;
	private List<Object> aList;
	private Object[] anArray;
	private Set<Object> aSet;
	private Map<Object, Object> aMap;
	private Properties theProperties;
	private List<Object> mergeList;
	private Set<Object> mergeSet;
	private Map<Object, Object> mergeMap;
	private List<Integer> formattedSuffix;
	private Set<Object> suffixUseUtilSet;
	
	private PrefixGenerator prefixGenerator;

	public SequenceGenerator() {}
	
	public SequenceGenerator(String prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	public SequenceGenerator(String prefix, String suffix) {
		this.prefix = prefix;
		this.suffix = suffix;
	}
	
	public SequenceGenerator(String prefix, int initial) {
		this.prefix = prefix;
		this.initial = initial;
	}
	
	public SequenceGenerator(int initial, String suffix) {
		this.suffix = suffix;
		this.initial = initial;
	}

	@Required
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public void setInitial(int initial) {
		this.initial = initial;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public void setaList(List<Object> aList) {
		this.aList = aList;
	}

	public void setAnArray(Object[] anArray) {
		this.anArray = anArray;
	}

	public void setaSet(Set<Object> aSet) {
		this.aSet = aSet;
	}

	public void setaMap(Map<Object, Object> aMap) {
		this.aMap = aMap;
	}

	public void setTheProperties(Properties theProperties) {
		this.theProperties = theProperties;
	}

	public void setMergeList(List<Object> mergeList) {
		this.mergeList = mergeList;
	}

	public void setMergeSet(Set<Object> mergeSet) {
		this.mergeSet = mergeSet;
	}

	public void setMergeMap(Map<Object, Object> mergeMap) {
		this.mergeMap = mergeMap;
	}

	public void setFormattedSuffix(List<Integer> formattedSuffix) {
		this.formattedSuffix = formattedSuffix;
	}

	public void setSuffixUseUtilSet(Set<Object> suffixUseUtilSet) {
		this.suffixUseUtilSet = suffixUseUtilSet;
	}

	public void setPrefixGenerator(PrefixGenerator prefixGenerator) {
		this.prefixGenerator = prefixGenerator;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		
		buffer.append("aList: \n");
		for (Object obj : aList) {
			buffer.append("-");
			buffer.append(obj);
		}
		buffer.append("\n");
		
		buffer.append("anArray: \n");
		for (Object obj : anArray) {
			buffer.append("-");
			buffer.append(obj);
		}
		buffer.append("\n");
		
		buffer.append("aSet: \n");
		for (Object obj : aSet) {
			buffer.append("-");
			buffer.append(obj);
		}
		buffer.append("\n");
		
		buffer.append("aMap: \n");
		for (Entry<Object, Object> entry : aMap.entrySet()) {
			buffer.append("-");
			buffer.append(entry.getKey());
			buffer.append("@");
			buffer.append(entry.getValue());
		}
		buffer.append("\n");
		
		buffer.append("theProperties: \n");
		for (Entry<Object, Object> entry : theProperties.entrySet()) {
			buffer.append("-");
			buffer.append(entry.getKey());
			buffer.append("@");
			buffer.append(entry.getValue());
		}
		buffer.append("\n");
		
		buffer.append("mergeList: \n");
		for (Object obj : mergeList) {
			buffer.append("-");
			buffer.append(obj);
		}
		buffer.append("\n");
		
		buffer.append("mergeSet: \n");
		for (Object obj : mergeSet) {
			buffer.append("-");
			buffer.append(obj);
		}
		buffer.append("\n");
		
		buffer.append("mergeMap: \n");
		for (Entry<Object, Object> entry : mergeMap.entrySet()) {
			buffer.append("-");
			buffer.append(entry.getKey());
			buffer.append("@");
			buffer.append(entry.getValue());
		}
		buffer.append("\n");
		
		return buffer.toString();
	}
	
	public synchronized String getSequence3() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		buffer.append(suffix);
		
		return buffer.toString();
	}
	
	public synchronized String getSequenceUseGenerator() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefixGenerator.getPrefix());
		buffer.append(initial + counter++);
		buffer.append(suffix);
		return buffer.toString();
	}
	
	public synchronized String getSequenceUseFormattedSuffix() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		
		DecimalFormat formatter = new DecimalFormat("0000");
		for (int suffix : formattedSuffix) {
			buffer.append("-");
			buffer.append(formatter.format(suffix));
		}
		return buffer.toString();
	}
	
	public synchronized String getSequenceUseUtilSet() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(prefix);
		buffer.append(initial + counter++);
		
		buffer.append("suffixUseUtilSet: \n");
		for (Object obj : suffixUseUtilSet) {
			buffer.append("-");
			buffer.append(obj);
		}
		buffer.append("\n");
		return buffer.toString();
	}
}
