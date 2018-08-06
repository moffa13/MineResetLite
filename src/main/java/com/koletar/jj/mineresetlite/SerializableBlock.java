package com.koletar.jj.mineresetlite;

import org.bukkit.Material;

/**
 * @author jjkoletar
 */
public class SerializableBlock {
	private Material blockType;
	private byte data;

	public SerializableBlock(Material blockType) {
		this.blockType = blockType;
	}


	public SerializableBlock(String self) {
			blockType = Material.matchMaterial(self);
	}

	public Material getBlockType() {
		return blockType;
	}

	public byte getData() {
		return data;
	}

	public String toString() {
		return blockType.name();
	}

	public boolean equals(Object o) {
		return o instanceof SerializableBlock
				&& (this.blockType == ((SerializableBlock) o).blockType);
	}
}
