/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.messages;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.messages.*;

import java.util.*;
public class Timer_startMessageType extends EventType {
public Timer_startMessageType() {name = "timer_start";}

public Event instantiate(final Port port, final short delay) { return new Timer_startMessage(this, port, delay); }
public class Timer_startMessage extends Event implements java.io.Serializable {

public final short delay;
@Override
public String toString(){
return "Timer_start " + "short: " + delay;}

protected Timer_startMessage(EventType type, Port port, final short delay) {
super(type, port);
this.delay = delay;
}
}

}

