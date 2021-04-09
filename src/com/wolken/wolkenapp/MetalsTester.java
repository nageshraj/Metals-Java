package com.wolken.wolkenapp;

public class MetalsTester {
	public static void main(String[] args) {
		MetalsDTO metalsDTO = new MetalsDTO();

		metalsDTO.setColor("Greyish-Silver");
		metalsDTO.setMetalAtomicNumber(47);
		metalsDTO.setMetalName("Silver");
		metalsDTO.setPrice(4000);

		MetalsDTO metalsDTO1 = new MetalsDTO();
		
		metalsDTO1.setColor("Golden-yellow");
		metalsDTO1.setMetalAtomicNumber(47);
		metalsDTO1.setMetalName("Gold");
		metalsDTO1.setPrice(4000);

		System.out.println(metalsDTO);
		System.out.println(metalsDTO.hashCode());

		System.out.println(metalsDTO.equals(metalsDTO1));

	}
}
