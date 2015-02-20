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
package haxe.lang;
import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public  interface IHxObject
{
	   boolean __hx_deleteField(java.lang.String field);
	
	   java.lang.Object __hx_lookupField(java.lang.String field, boolean throwErrors, boolean isCheck);
	
	   double __hx_lookupField_f(java.lang.String field, boolean throwErrors);
	
	   java.lang.Object __hx_lookupSetField(java.lang.String field, java.lang.Object value);
	
	   double __hx_lookupSetField_f(java.lang.String field, double value);
	
	   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties);
	
	   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties);
	
	   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties);
	
	   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties);
	
	   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs);
	
	   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr);
	
}


