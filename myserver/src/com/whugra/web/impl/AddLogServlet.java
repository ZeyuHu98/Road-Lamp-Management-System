package com.whugra.web.impl;

import com.whugra.web.support.LogControllerSupport;

/**
 * Created by Hzy on 2020/4/26.
 */
public class AddLogServlet extends LogControllerSupport
{
    @Override
    public void execute() throws Exception
    {
        this.update("addLog");
    }
}
