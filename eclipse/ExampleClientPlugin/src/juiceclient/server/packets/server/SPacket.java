package juiceclient.server.packets.server;

import juiceclient.server.packets.ECPacket;
import net.minecraft.server.v1_8_R3.PacketDataSerializer;
import net.minecraft.server.v1_8_R3.PacketListener;

public abstract class SPacket extends ECPacket{
	
	@Override
	public void handle(PacketListener listener) {
		
	}
	
	@Override
	public void readPacketData(PacketDataSerializer data) {
		
	}
	
}
