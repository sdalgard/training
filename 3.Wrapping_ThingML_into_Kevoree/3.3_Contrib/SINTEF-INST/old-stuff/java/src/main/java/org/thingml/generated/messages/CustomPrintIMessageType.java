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
public class CustomPrintIMessageType extends EventType {
public CustomPrintIMessageType() {name = "customPrintI";}

public Event instantiate(final Port port, final short myInt) { return new CustomPrintIMessage(this, port, myInt); }
public class CustomPrintIMessage extends Event implements java.io.Serializable {

public final short myInt;
@Override
public String toString(){
return "CustomPrintI " + "short: " + myInt;}

protected CustomPrintIMessage(EventType type, Port port, final short myInt) {
super(type, port);
this.myInt = myInt;
}
}

}

