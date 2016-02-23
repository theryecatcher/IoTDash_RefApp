
package org.mimosa.osacbmv3_3;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for LocalTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dst" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hourDelta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minDelta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalTime", propOrder = {
    "dst",
    "hourDelta",
    "minDelta"
})
public class LocalTime
    implements Serializable, Equals, HashCode, ToString
{

    protected boolean dst;
    protected int hourDelta;
    protected int minDelta;

    /**
     * Gets the value of the dst property.
     * 
     */
    public boolean isDst() {
        return dst;
    }

    /**
     * Sets the value of the dst property.
     * 
     */
    public void setDst(boolean value) {
        this.dst = value;
    }

    /**
     * Gets the value of the hourDelta property.
     * 
     */
    public int getHourDelta() {
        return hourDelta;
    }

    /**
     * Sets the value of the hourDelta property.
     * 
     */
    public void setHourDelta(int value) {
        this.hourDelta = value;
    }

    /**
     * Gets the value of the minDelta property.
     * 
     */
    public int getMinDelta() {
        return minDelta;
    }

    /**
     * Sets the value of the minDelta property.
     * 
     */
    public void setMinDelta(int value) {
        this.minDelta = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            boolean theDst;
            theDst = (true?this.isDst():false);
            strategy.appendField(locator, this, "dst", buffer, theDst);
        }
        {
            int theHourDelta;
            theHourDelta = (true?this.getHourDelta(): 0);
            strategy.appendField(locator, this, "hourDelta", buffer, theHourDelta);
        }
        {
            int theMinDelta;
            theMinDelta = (true?this.getMinDelta(): 0);
            strategy.appendField(locator, this, "minDelta", buffer, theMinDelta);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LocalTime)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final LocalTime that = ((LocalTime) object);
        {
            boolean lhsDst;
            lhsDst = (true?this.isDst():false);
            boolean rhsDst;
            rhsDst = (true?that.isDst():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dst", lhsDst), LocatorUtils.property(thatLocator, "dst", rhsDst), lhsDst, rhsDst)) {
                return false;
            }
        }
        {
            int lhsHourDelta;
            lhsHourDelta = (true?this.getHourDelta(): 0);
            int rhsHourDelta;
            rhsHourDelta = (true?that.getHourDelta(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hourDelta", lhsHourDelta), LocatorUtils.property(thatLocator, "hourDelta", rhsHourDelta), lhsHourDelta, rhsHourDelta)) {
                return false;
            }
        }
        {
            int lhsMinDelta;
            lhsMinDelta = (true?this.getMinDelta(): 0);
            int rhsMinDelta;
            rhsMinDelta = (true?that.getMinDelta(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minDelta", lhsMinDelta), LocatorUtils.property(thatLocator, "minDelta", rhsMinDelta), lhsMinDelta, rhsMinDelta)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            boolean theDst;
            theDst = (true?this.isDst():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dst", theDst), currentHashCode, theDst);
        }
        {
            int theHourDelta;
            theHourDelta = (true?this.getHourDelta(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hourDelta", theHourDelta), currentHashCode, theHourDelta);
        }
        {
            int theMinDelta;
            theMinDelta = (true?this.getMinDelta(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minDelta", theMinDelta), currentHashCode, theMinDelta);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
