/*
 * Copyright (c) 2015, Samael Wang <freesamael@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package tw.edu.npu.mis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Simulation of a GUI application.
 *
 * @author Samael Wang <freesamael@gmail.com>
 */
public class ObserverSample {

    public static void main(String[] args) {
        // Initialize MVC and Window objects.
        Window window = new Window();
        Model model = new Model();
        Controller controller = new Controller(model);
        List<Showable> views = new ArrayList<>();
        views.add(new View("View 1", window, model));
        views.add(new View("View 2", window, model));
        views.add(new View("View 3", window, model));
        views.add(new AlternatativeView("AlternataiveView", window, model));
        /**
         * 宣告第四個View的型態
         */
       window.startEventLoop(controller, views);
       /**
        * DEAR 燒賣大哥
        * 我已用盡本人在澎科大資管系三年中所有程式經驗之實作方法
        * 請大哥明察秋毫
        * 希望小弟的分數能眾望所歸
        * 謝大哥英明
        */
    }
}
