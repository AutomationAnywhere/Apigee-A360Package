/* Copyright (c) 2022 Automation Anywhere. All rights reserved.
 *
 * This software is the proprietary information of Automation Anywhere. You shall use it only in
 * accordance with the terms of the license agreement you entered into with Automation Anywhere.
 */
package com.automationanywhere.botcommand.objects.apigee;

import java.util.List;

public class IntegrationVersion {
    public String state;
    public List<IntegrationParameter> integrationParameters;
    public List<IntegrationTriggerConfig> triggerConfigs;
}
