// Copyright © 2019-2020 Andy Goryachev <andy@goryachev.com>
package goryachev.fx;


/**
 * These application-wide flags control FX subsystem.
 */
public class FxConfig
{
	/** -Dcss.refresh=true enables polling of css style sheet for changes */
	public static boolean cssRefreshEnabled() { return Boolean.getBoolean("css.refresh"); };
}
