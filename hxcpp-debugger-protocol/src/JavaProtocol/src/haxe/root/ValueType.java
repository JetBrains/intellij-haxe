/*
 * Copyright 2000-2013 JetBrains s.r.o.
 * Copyright 2014-2014 AS3Boyan
 * Copyright 2014-2014 Elias Ku
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package haxe.root;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ValueType extends haxe.lang.Enum
{
	static 
	{
		haxe.root.ValueType.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"TNull", "TInt", "TFloat", "TBool", "TObject", "TFunction", "TClass", "TEnum", "TUnknown"});
		haxe.root.ValueType.TNull = new haxe.root.ValueType(((int) (0) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		haxe.root.ValueType.TInt = new haxe.root.ValueType(((int) (1) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		haxe.root.ValueType.TFloat = new haxe.root.ValueType(((int) (2) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		haxe.root.ValueType.TBool = new haxe.root.ValueType(((int) (3) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		haxe.root.ValueType.TObject = new haxe.root.ValueType(((int) (4) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		haxe.root.ValueType.TFunction = new haxe.root.ValueType(((int) (5) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
		haxe.root.ValueType.TUnknown = new haxe.root.ValueType(((int) (8) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{})) ));
	}
	public    ValueType(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  haxe.root.ValueType TNull;
	
	public static  haxe.root.ValueType TInt;
	
	public static  haxe.root.ValueType TFloat;
	
	public static  haxe.root.ValueType TBool;
	
	public static  haxe.root.ValueType TObject;
	
	public static  haxe.root.ValueType TFunction;
	
	public static   haxe.root.ValueType TClass(java.lang.Class c)
	{
		return new haxe.root.ValueType(((int) (6) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{c})) ));
	}
	
	
	public static   haxe.root.ValueType TEnum(java.lang.Class e)
	{
		return new haxe.root.ValueType(((int) (7) ), ((haxe.root.Array<java.lang.Object>) (new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{e})) ));
	}
	
	
	public static  haxe.root.ValueType TUnknown;
	
}


