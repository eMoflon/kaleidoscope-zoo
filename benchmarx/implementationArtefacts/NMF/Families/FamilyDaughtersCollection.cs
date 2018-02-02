//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2017.FamiliesToPersons.NMF.Families
{
    
    
    public class FamilyDaughtersCollection : ObservableOppositeOrderedSet<IFamily, IFamilyMember>
    {
        
        public FamilyDaughtersCollection(IFamily parent) : 
                base(parent)
        {
        }
        
        private void OnItemParentChanged(object sender, ValueChangedEventArgs e)
        {
            if ((e.NewValue != this.Parent))
            {
                this.Remove(((IFamilyMember)(sender)));
            }
        }
        
        protected override void SetOpposite(IFamilyMember item, IFamily parent)
        {
            if ((parent != null))
            {
                item.ParentChanged += this.OnItemParentChanged;
                item.DaughtersInverse = parent;
            }
            else
            {
                item.ParentChanged -= this.OnItemParentChanged;
                if ((item.DaughtersInverse == this.Parent))
                {
                    item.DaughtersInverse = parent;
                }
            }
        }
    }
}

