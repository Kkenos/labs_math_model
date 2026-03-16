package lab2_dom;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;
import com.anylogic.engine.omniverse_connector.*;

import com.anylogic.libraries.modules.markup_descriptors.*;
import com.anylogic.libraries.processmodeling.*;

/*INJ:Import*/
 
/*INJ:Import*/
public class Main extends Agent {

private static final long serialVersionUID = 1L;
protected com.anylogic.engine.markup.Level level;
public com.anylogic.libraries.processmodeling.Source<Agent> Посетители;
public com.anylogic.libraries.processmodeling.Queue<Agent> Очередь_К_Пивню;
public com.anylogic.libraries.processmodeling.Delay<Agent> Пивень;
public com.anylogic.libraries.processmodeling.SelectOutput<Agent> Заказы;
public com.anylogic.libraries.processmodeling.Sink<Agent> За_стол;
public com.anylogic.libraries.processmodeling.Queue<Agent> queueGoblin1;
public com.anylogic.libraries.processmodeling.Queue<Agent> queueGoblin2;
public com.anylogic.libraries.processmodeling.SelectOutput<Agent> выбор_повара;
public com.anylogic.libraries.processmodeling.Delay<Agent> goblin1_del;
public com.anylogic.libraries.processmodeling.Delay<Agent> goblin2_del;
public com.anylogic.libraries.processmodeling.Sink<Agent> sink;
public com.anylogic.libraries.processmodeling.Sink<Agent> sink1;
public LinkToAgentCollection<Agent, Agent> connections;
@AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
public static final Scale scale = null;
/**
 * Конструктор
 */
public Main(Engine engine,Agent owner,AgentList<? extends Main> ownerPopulation) { throw new UnsupportedOperationException(); }
/**
 * Simple constructor. Please add created agent to some population by calling goToPopulation() function.
 */
public Main() { throw new UnsupportedOperationException(); }
protected ShapeTopLevelPresentationGroup presentation;
protected ShapeModelElementsGroup icon;
public ViewArea _origin_VA;
/*INJ:Additional Code*/
 
/*INJ:Additional Code*/

}
