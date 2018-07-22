/*******************************************************************************
 * Copyright 2018 Dsilva Software Solution
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *	ApplicationForm.java
 *	21-Jul-2018
 *	marsh
 *	2018
 *	
 * SRNo		Name					Date 		Tag					Comment			
 ******************************************************************************/
/**
 * 
 */
package com.dsilva.mms.web.model;

import java.io.Serializable;

import javax.annotation.Nonnull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author marsh
 *
 */

@Entity
@Table(name="ApplicationForm")
public class ApplicationForm {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="ApplicationForm",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="ApplicationForm",sequenceName="seq_ApplicationForm",initialValue=1,allocationSize=1 )
	private long userId;

	@Nonnull
	private String userName;

	@Nonnull
	private String religion;
	
	private String subCaste;
	
	private String education;
	
	private String profession;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSubCaste() {
		return subCaste;
	}

	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}


}
