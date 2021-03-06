/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.messages.*;

import java.util.*;

/**
 * Definition for type : PIFIncDec
 **/
public class PIFIncDec extends Component  {

private void sendPif_token_via_to_ender(short PrintIncForwardMsgs_pif_token_token__var){
//ThingML send
send(pif_tokenType.instantiate(to_ender_port, PrintIncForwardMsgs_pif_token_token__var), to_ender_port);
}

private void sendPif_token_via_to_starter(short PrintIncForwardMsgs_pif_token_token__var){
//ThingML send
send(pif_tokenType.instantiate(to_starter_port, PrintIncForwardMsgs_pif_token_token__var), to_starter_port);
}

private void sendCustomPrintS_via_Print(String CustomPrintMsgs_customPrintS_myString__var){
//ThingML send
send(customPrintSType.instantiate(Print_port, CustomPrintMsgs_customPrintS_myString__var), Print_port);
}

private void sendCustomPrintI_via_Print(short CustomPrintMsgs_customPrintI_myInt__var){
//ThingML send
send(customPrintIType.instantiate(Print_port, CustomPrintMsgs_customPrintI_myInt__var), Print_port);
}

//Attributes
private short PIFIncDec_behavior_tmp__var;
//Ports
private Port from_starter_port;
private Port to_ender_port;
private Port to_starter_port;
private Port from_ender_port;
private Port Print_port;
//Message types
protected final Pif_tokenMessageType pif_tokenType = new Pif_tokenMessageType();
public Pif_tokenMessageType getPif_tokenType(){
return pif_tokenType;
}

protected final CustomPrintSMessageType customPrintSType = new CustomPrintSMessageType();
public CustomPrintSMessageType getCustomPrintSType(){
return customPrintSType;
}

protected final CustomPrintIMessageType customPrintIType = new CustomPrintIMessageType();
public CustomPrintIMessageType getCustomPrintIType(){
return customPrintIType;
}

//Empty Constructor
public PIFIncDec() {
super(5);
}

//Constructor (all attributes)
public PIFIncDec(String name, final short PIFIncDec_behavior_tmp__var) {
super(name, 5);
this.PIFIncDec_behavior_tmp__var = PIFIncDec_behavior_tmp__var;
}

//Getters and Setters for non readonly/final attributes
public short getPIFIncDec_behavior_tmp__var() {
return PIFIncDec_behavior_tmp__var;
}

public void setPIFIncDec_behavior_tmp__var(short PIFIncDec_behavior_tmp__var) {
this.PIFIncDec_behavior_tmp__var = PIFIncDec_behavior_tmp__var;
}

//Getters for Ports
public Port getFrom_starter_port() {
return from_starter_port;
}
public Port getTo_ender_port() {
return to_ender_port;
}
public Port getTo_starter_port() {
return to_starter_port;
}
public Port getFrom_ender_port() {
return from_ender_port;
}
public Port getPrint_port() {
return Print_port;
}
private CompositeState buildPIFIncDec_behavior(){
final List<AtomicState> states_PIFIncDec_behavior = new ArrayList<AtomicState>();
final AtomicState state_PIFIncDec_behavior_Init = new AtomicState("Init")
;
states_PIFIncDec_behavior.add(state_PIFIncDec_behavior_Init);
final List<Region> regions_PIFIncDec_behavior = new ArrayList<Region>();
final List<Handler> transitions_PIFIncDec_behavior = new ArrayList<Handler>();
transitions_PIFIncDec_behavior.add(new Transition("Handler_18924649",pif_tokenType, from_starter_port, state_PIFIncDec_behavior_Init, state_PIFIncDec_behavior_Init){
@Override
public void doExecute(final Event e) {
final Pif_tokenMessageType.Pif_tokenMessage ce = (Pif_tokenMessageType.Pif_tokenMessage) e;
PIFIncDec_behavior_tmp__var = (short) (ce.token);
sendCustomPrintI_via_Print((short) (getPIFIncDec_behavior_tmp__var()));
PIFIncDec_behavior_tmp__var = (short) (getPIFIncDec_behavior_tmp__var() + 1);
sendPif_token_via_to_ender((short) (getPIFIncDec_behavior_tmp__var()));
}

});
transitions_PIFIncDec_behavior.add(new Transition("Handler_20865424",pif_tokenType, from_ender_port, state_PIFIncDec_behavior_Init, state_PIFIncDec_behavior_Init){
@Override
public void doExecute(final Event e) {
final Pif_tokenMessageType.Pif_tokenMessage ce = (Pif_tokenMessageType.Pif_tokenMessage) e;
PIFIncDec_behavior_tmp__var = (short) (ce.token);
sendCustomPrintI_via_Print((short) (getPIFIncDec_behavior_tmp__var()));
PIFIncDec_behavior_tmp__var = (short) (getPIFIncDec_behavior_tmp__var() - 1);
sendPif_token_via_to_starter((short) (getPIFIncDec_behavior_tmp__var()));
}

});
final CompositeState state_PIFIncDec_behavior = new CompositeState("behavior", states_PIFIncDec_behavior, state_PIFIncDec_behavior_Init, transitions_PIFIncDec_behavior, regions_PIFIncDec_behavior, false);
return state_PIFIncDec_behavior;
}

public Component buildBehavior() {
//Init ports
final List<EventType> inEvents_from_starter = new ArrayList<EventType>();
final List<EventType> outEvents_from_starter = new ArrayList<EventType>();
inEvents_from_starter.add(pif_tokenType);
from_starter_port = new Port(PortType.REQUIRED, "from_starter", inEvents_from_starter, outEvents_from_starter, 0);
final List<EventType> inEvents_to_ender = new ArrayList<EventType>();
final List<EventType> outEvents_to_ender = new ArrayList<EventType>();
outEvents_to_ender.add(pif_tokenType);
to_ender_port = new Port(PortType.PROVIDED, "to_ender", inEvents_to_ender, outEvents_to_ender, 1);
final List<EventType> inEvents_to_starter = new ArrayList<EventType>();
final List<EventType> outEvents_to_starter = new ArrayList<EventType>();
outEvents_to_starter.add(pif_tokenType);
to_starter_port = new Port(PortType.PROVIDED, "to_starter", inEvents_to_starter, outEvents_to_starter, 2);
final List<EventType> inEvents_from_ender = new ArrayList<EventType>();
final List<EventType> outEvents_from_ender = new ArrayList<EventType>();
inEvents_from_ender.add(pif_tokenType);
from_ender_port = new Port(PortType.REQUIRED, "from_ender", inEvents_from_ender, outEvents_from_ender, 3);
final List<EventType> inEvents_Print = new ArrayList<EventType>();
final List<EventType> outEvents_Print = new ArrayList<EventType>();
outEvents_Print.add(customPrintSType);
outEvents_Print.add(customPrintIType);
Print_port = new Port(PortType.PROVIDED, "Print", inEvents_Print, outEvents_Print, 4);
//Init state machine
behavior = buildPIFIncDec_behavior();
return this;
}

}
