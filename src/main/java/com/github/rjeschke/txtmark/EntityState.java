/*
 * Copyright (C) 2011-2015 René Jeschke <rene_jeschke@yahoo.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.rjeschke.txtmark;

/**
 * States for parsing entities types.
 *
 * @author NCull
 * @see Emitter#checkEntity(StringBuilder, String, int)
 */
enum EntityState {
    /** Corresponds to leading &amp; */
    INIT,
    /** Corresponds to leading &amp;# */
    NUMERIC,
    /** Decimal digits after &amp;# */
    DECIMAL,
    /** Hex digits after &amp;#x */
    HEX,
    /** NameChar characters after &amp; */
    CHARACTER,
    /** Corresponds to trailing ; */
    TERMINAL
}
