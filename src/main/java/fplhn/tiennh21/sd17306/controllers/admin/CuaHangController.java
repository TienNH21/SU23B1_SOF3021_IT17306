package fplhn.tiennh21.sd17306.controllers.admin;

import fplhn.tiennh21.sd17306.request.CuaHangVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cua-hang")
public class CuaHangController {
    @Autowired
    @Qualifier("cuaHangVM1")
    private CuaHangVM vm;

    @GetMapping("create")
    public String create(Model model)
    {
        model.addAttribute("vm", vm);
        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(
        @Valid @ModelAttribute("vm") CuaHangVM vm,
        BindingResult result
    ) {
        if (result.hasErrors()) {
            // Báo lỗi
            System.out.println(vm.getTen());
            return "admin/cua_hang/create";
        } else {
            // Thành công
        }
        return "admin/cua_hang/create";
    }
}
