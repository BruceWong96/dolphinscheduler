/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.dao.repository;

import org.apache.dolphinscheduler.common.enums.ContextType;
import org.apache.dolphinscheduler.dao.entity.TaskInstanceContext;

import java.util.List;

public interface TaskInstanceContextDao extends IDao<TaskInstanceContext> {

    List<TaskInstanceContext> queryListByTaskInstanceIdAndContextType(Integer taskInstanceId,
                                                                      ContextType contextType);

    int deleteByTaskInstanceIdAndContextType(Integer taskInstanceId,
                                             ContextType contextType);

    int upsertTaskInstanceContext(TaskInstanceContext taskDependentResult);

    List<TaskInstanceContext> batchQueryByTaskInstanceIdsAndContextType(List<Integer> taskInstanceIds,
                                                                        ContextType contextType);
}