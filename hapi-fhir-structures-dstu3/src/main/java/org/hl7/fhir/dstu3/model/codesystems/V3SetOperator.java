package org.hl7.fhir.dstu3.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Mon, Apr 17, 2017 17:38-0400 for FHIR v3.0.1


import org.hl7.fhir.exceptions.FHIRException;

public enum V3SetOperator {

        /**
         * Operations that can be used to associate concepts in a terminology.
         */
        _VALUESETOPERATOR, 
        /**
         * Form the set-difference with this value, i.e., exclude this element or set from the resulting set.
         */
        E, 
        /**
         * Form the union with this value, i.e., include this element or set in the resulting set.
         */
        I, 
        /**
         * Form the intersection with the value.
         */
        A, 
        /**
         * Form the convex hull with the value. The convex hull is defined over ordered domains and is the smallest contiguous superset (interval) that of all the operand sets.
         */
        H, 
        /**
         * Form the periodic hull with the value. The periodic hull is defined over ordered domains and is the periodic set that contains all contiguous supersets of pairs of intervals generated by the operand periodic intervals.
         */
        P, 
        /**
         * added to help the parsers
         */
        NULL;
        public static V3SetOperator fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("_ValueSetOperator".equals(codeString))
          return _VALUESETOPERATOR;
        if ("E".equals(codeString))
          return E;
        if ("I".equals(codeString))
          return I;
        if ("A".equals(codeString))
          return A;
        if ("H".equals(codeString))
          return H;
        if ("P".equals(codeString))
          return P;
        throw new FHIRException("Unknown V3SetOperator code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case _VALUESETOPERATOR: return "_ValueSetOperator";
            case E: return "E";
            case I: return "I";
            case A: return "A";
            case H: return "H";
            case P: return "P";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/v3/SetOperator";
        }
        public String getDefinition() {
          switch (this) {
            case _VALUESETOPERATOR: return "Operations that can be used to associate concepts in a terminology.";
            case E: return "Form the set-difference with this value, i.e., exclude this element or set from the resulting set.";
            case I: return "Form the union with this value, i.e., include this element or set in the resulting set.";
            case A: return "Form the intersection with the value.";
            case H: return "Form the convex hull with the value. The convex hull is defined over ordered domains and is the smallest contiguous superset (interval) that of all the operand sets.";
            case P: return "Form the periodic hull with the value. The periodic hull is defined over ordered domains and is the periodic set that contains all contiguous supersets of pairs of intervals generated by the operand periodic intervals.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case _VALUESETOPERATOR: return "ValueSetOperator";
            case E: return "exclude";
            case I: return "include";
            case A: return "intersect";
            case H: return "convex hull";
            case P: return "periodic hull";
            default: return "?";
          }
    }


}

