/**
 * Copyright © 2002 Instituto Superior Técnico
 *
 * This file is part of FenixEdu Core.
 *
 * FenixEdu Core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu Core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu Core.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.fenixedu.academic.ui.struts.action.masterDegree.administrativeOffice.candidate;

import org.fenixedu.academic.ui.struts.action.commons.ChooseExecutionYearToVisualizeCandidatesDA;

import org.fenixedu.bennu.struts.annotations.Forward;
import org.fenixedu.bennu.struts.annotations.Forwards;
import org.fenixedu.bennu.struts.annotations.Mapping;

@Mapping(path = "/visualizeCandidates", module = "masterDegreeAdministrativeOffice", input = "/chooseCandidateList_bd.jsp",
        formBean = "listCandidatesForm", functionality = ChooseExecutionYearToVisualizeCandidatesDA.class)
@Forwards({ @Forward(name = "PrepareReady", path = "/masterDegreeAdministrativeOffice/chooseCandidateList_bd.jsp"),
        @Forward(name = "ActionReady", path = "/masterDegreeAdministrativeOffice/visualizePersonCandidateList_bd.jsp"),
        @Forward(name = "VisualizeCandidate", path = "/masterDegreeAdministrativeOffice/visualizeCandidate_bd.jsp"),
        @Forward(name = "ChooseCandidate", path = "/masterDegreeAdministrativeOffice/candidateList_bd.jsp") })
public class VisualizeCandidatesDA extends EditCandidateDA {

}
